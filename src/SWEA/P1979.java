package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1979. 어디에 단어가 들어갈 수 있을까

    public class P1979{
        public static void main(String[] args)throws IOException{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int tn=Integer.parseInt(br.readLine());


            for(int i=1;i<=tn;i++) {
                StringTokenizer st=new StringTokenizer(br.readLine());
                int N=Integer.parseInt(st.nextToken());
                int K=Integer.parseInt(st.nextToken());
                int[][] map=new int[N][N];
                int result=0;

                for(int j=0;j<N;j++) {
                    StringTokenizer st1=new StringTokenizer(br.readLine());
                    for(int k=0;k<N;k++) {
                        map[j][k]=Integer.parseInt(st1.nextToken());
                    }
                }

                for(int j=0;j<N;j++) {
                    for(int m=0;m<(N-K+1);m++) {
                        int rowDetector=0;
                        int columnDetector=0;
                        for(int l=0;l<K;l++) {
                            rowDetector+=map[j][m+l];
                            columnDetector+=map[m+l][j];
                        }
                        if(N==(m+K)) {
                            if(rowDetector==K && map[j][m-1]!=1)result++;
                            if(columnDetector==K && map[m-1][j]!=1)result++;
                        }else if(m!=0){
                            if(rowDetector==K && map[j][m+K]!=1 && map[j][m-1]!=1)result++;
                            if(columnDetector==K && map[m+K][j]!=1 && map[m-1][j]!=1)result++;
                        }else {
                            if(rowDetector==K && map[j][m+K]!=1 )result++;
                            if(columnDetector==K && map[m+K][j]!=1 )result++;
                        }

                    }
                }
                System.out.println("#"+i+" "+result);
            }
        }
    }
