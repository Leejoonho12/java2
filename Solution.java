import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int res = solution(board, moves);
		
		System.out.println(res);
		

	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
        ArrayList<Integer> box = new ArrayList<Integer>();
        box.add(0);
        for(int i = 0; i < moves.length; i++) {
        	for(int j = 0; j < board.length; j++){
        		if(board[j][moves[i]-1] != 0){
        			if(box.get(box.size()-1) == board[j][moves[i]-1]) {
        				box.remove(box.size()-1);
        				answer +=2;
        			}else {
                        box.add(board[j][moves[i]-1]);
        			} 
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return answer;
	}
	
	

}
