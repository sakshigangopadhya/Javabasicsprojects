import java.util.*;

public class GraphList 
{
    private ArrayList<ArrayList<Integer>> AL;
    private int Ver;

    public GraphList(int Ver) 
    {
        this.Ver = Ver;
        AL = new ArrayList<>();

        for (int i = 0; i < Ver; i++) 
        {
            AL.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int end) 
    {
        AL.get(src).add(end);
        AL.get(end).add(src);     }

    public void removeEdge(int src, int end) 
    {
        AL.get(src).remove(Integer.valueOf(end));
        AL.get(end).remove(Integer.valueOf(src));
    }

    public void printGraph() 
    {
        System.out.println("Adjacency List:");

        for (int i = 0; i < Ver; i++) 
        {
            System.out.print(i + " -> ");

            for (int j : AL.get(i)) 
            {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        GraphList graph = new GraphList(9);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(6, 7);
        graph.addEdge(7, 3);
        graph.addEdge(7, 8);

        graph.printGraph();
    }
}