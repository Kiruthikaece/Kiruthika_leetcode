class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
          int totalTime = 0;

        for (int i = 1; i < points.length; i++) {
            int pX = points[i - 1][0];
            int pY = points[i - 1][1];

            int cX = points[i][0];
            int cY = points[i][1];

            int dx = Math.abs(cX - pX);
            int dy = Math.abs(cY - pY);

            totalTime += Math.max(dx, dy);
        }

        return totalTime;
    }
}
