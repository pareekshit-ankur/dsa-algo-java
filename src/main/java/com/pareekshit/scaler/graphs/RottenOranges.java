package main.java.com.pareekshit.scaler.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    Queue<Integer[]> queue = new LinkedList<>();
    int[] dx = new int[]{0, -1, 1, 0};
    int[] dy = new int[]{-1, 0, 0, 1};

    public int solve(int[][] A) {
        int fresh = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 2) {
                    queue.add(new Integer[]{i, j, 0});
                } else if (A[i][j] == 1) {
                    fresh++;
                }
            }
        }
        int t = 0;
        while (!queue.isEmpty()) {
            Integer[] cell = queue.poll();
            t = Math.max(t, cell[2]);
            for (int i = 0; i < 4; i++) {
                int x = cell[0] + dx[i];
                int y = cell[1] + dy[i];
                if (0 <= x && x <= A.length - 1 && 0 <= y && y <= A[0].length - 1 && A[x][y] == 2) {
                    A[x][y] = 2;
                    queue.add(new Integer[]{x, y, cell[2] + 1});
                    fresh--;
                }
            }
        }
        if (fresh > 0) {
            return -1;
        }
        return t;
    }

    //Working Code
    /*LinkedList<Integer[]> q=new LinkedList<>();
    int rows[]=new int[]{-1,0,1,0};
    int cols[]=new int[]{0, 1,0,-1};

    public int solve(int[][] A) {
        int n=A.length;
        int m=A[0].length;
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i][j]==2){
                    q.add(new Integer[]{i,j,0});
                }else if(A[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0) return 0;
        int max_time=0;
        while(!q.isEmpty()){
            Integer[] cell=q.remove();
            int x=cell[0];
            int y=cell[1];
            int time=cell[2];
            max_time=time;

            for(int i=0;i<=3;i++){
                int newx=x+rows[i];
                int newy=y+cols[i];
                if(newx>=0 && newx<n && newy>=0 && newy<m){
                    if(A[newx][newy]==1){
                        A[newx][newy]=2;
                        q.add(new Integer[]{newx,newy,time+1});
                        fresh–;
                    }
                }
            }
        }

        if(fresh>0) return -1;

        return max_time;
    }*/
}
