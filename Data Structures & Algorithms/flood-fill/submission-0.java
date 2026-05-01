class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int origialColor = image[sr][sc];
        if(origialColor==color)
            return image;
        fillColor(image,sr,sc,color,origialColor);
        return image;
    }
    void fillColor(int[][] image, int i, int j, int color, int originalColor){
        int rows = image.length;
        int cols = image[0].length;
        if(i<0 || j<0 || j>=cols || i>=rows || image[i][j]!=originalColor)
            return;
        image[i][j] = color;
        fillColor(image,i+1,j,color,originalColor);
        fillColor(image,i,j+1,color,originalColor);
        fillColor(image,i-1,j,color,originalColor);
        fillColor(image,i,j-1,color,originalColor);
    }
}