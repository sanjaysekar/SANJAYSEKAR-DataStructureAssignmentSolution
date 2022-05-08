package Building;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BuildSkyScrapperUsingPQ {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the total no of floors in the building");
			int totalNoOfBuildings = sc.nextInt();
			int[] floorSize = new int[totalNoOfBuildings+1];
			for(int i=1;i<=totalNoOfBuildings;i++) {
				System.out.println("enter the floor size given on day : "+i);
				floorSize[i] = sc.nextInt();
			}
			buildSkyScraper(totalNoOfBuildings,floorSize);
		}
	}
	
	private static void buildSkyScraper(int n,int[] floorSize) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int max = n;
		for(int i=1;i<=n;i++) {
			pq.add(floorSize[i]);
			System.out.println("\nDay: "+i+" \n");

			while(pq.peek()!=null && pq.peek()==max) {
				System.out.print(pq.poll()+" ");
				max--;
			}
		}

	}
}
