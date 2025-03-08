import java.util.*;

/**
 * 
 * It looks like you are working on a coding challenge where you need to extract a string from a grid by following a path. Would you like me to analyze the file you uploaded and help you implement the followPath method? Let me know how you'd like to proceed!
 * 
 */


public class PathFollower {
    public static String followPath(List<String> grid) {
        int rows = grid.size();
        int cols = grid.get(0).length();
        
        // Directions: (Up, Right, Down, Left)
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        // Starting position (0,0)
        int x = 0, y = 0;
        StringBuilder pathWord = new StringBuilder();
        
        // Set to track visited positions
        Set<String> visited = new HashSet<>();
        visited.add(x + "," + y);
        
        while (true) {
            char currentChar = grid.get(x).charAt(y);
            if (Character.isLowerCase(currentChar)) {
                pathWord.append(currentChar);
            }

            boolean foundNext = false;
            for (int[] dir : directions) {
                int nx = x + dir[0], ny = y + dir[1];
                
                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && !visited.contains(nx + "," + ny)) {
                    char nextChar = grid.get(nx).charAt(ny);
                    
                    if (nextChar == '*' || Character.isLowerCase(nextChar)) {
                        x = nx;
                        y = ny;
                        visited.add(x + "," + y);
                        foundNext = true;
                        break;
                    }
                }
            }
            
            if (!foundNext) break; // Stop if no valid moves are found
        }
        
        return pathWord.toString();
    }

    public static void main(String[] args) {
        List<String> grid = Arrays.asList(
            "a**************",
            "*b*************",
            "*c*************",
            "*d*************",
            "*e*************",
            "*f*************",
            "*g*************",
            "*h*************",
            "*i*************",
            "*j*************"
        );

        System.out.println(followPath(grid)); // Expected output: "abcdefghij"
    }
}