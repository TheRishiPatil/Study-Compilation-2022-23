import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Course_Schedule{
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Create adjacency list representation of the graph
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            graph.get(course).add(prerequisiteCourse);
        }

        // Initialize visited and recursion stack arrays
        boolean[] visited = new boolean[numCourses];
        boolean[] recursionStack = new boolean[numCourses];

        // Check for cycles in each course
        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(i, graph, visited, recursionStack)) {
                return false; // Cycle detected, cannot finish the course
            }
        }

        return true; // No cycles detected, can finish the course
    }

    private boolean hasCycle(int course, List<List<Integer>> graph, boolean[] visited, boolean[] recursionStack) {
        if (recursionStack[course]) {
            return true; // Cycle detected
        }

        if (visited[course]) {
            return false; // Already visited this course and its descendants
        }

        // Mark the course as visited and add it to the recursion stack
        visited[course] = true;
        recursionStack[course] = true;

        // Check for cycles in the prerequisites of the course
        for (int prerequisite : graph.get(course)) {
            if (hasCycle(prerequisite, graph, visited, recursionStack)) {
                return true; // Cycle detected
            }
        }

        // Remove the course from the recursion stack
        recursionStack[course] = false;

        return false; // No cycles detected
    }
}