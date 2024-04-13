class PrefixSum2D {
    int[][] grid;
    int[][] prefixSum;

    public PrefixSum2D(int[][] grid) {
        this.grid = grid;
        buildPrefixSum();
    }

    public int sumQuery(int i1, int j1, int i2, int j2) {
        int sum = prefixSum[i2][j2];
        if (i1 > 0) {
            sum -= prefixSum[i1 - 1][j2];
        }
        if (j1 > 0) {
            sum -= prefixSum[i2][j1 - 1];
        }
        if (i1 > 0 && j1 > 0) {
            sum += prefixSum[i1 - 1][j1 - 1];
        }

        return sum;
    }

    public void buildPrefixSum() {
        int m = grid.length;
        int n = grid[0].length;
        prefixSum = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefixSum[i][j] = grid[i][j];
                if (i > 0) {
                    prefixSum[i][j] += prefixSum[i - 1][j];
                }
                if (j > 0) {
                    prefixSum[i][j] += prefixSum[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    prefixSum[i][j] -= prefixSum[i - 1][j - 1];
                }
            }
        }
    }
}
