package Start1;

import java.util.Scanner;
public class Rehab {
public int solution(int[] A, int X, int Y) {
int N = A.length;
int[] dp = new int[N + 1];

// Initialize dp[0] to 0 (no rehabilitation sessions).
dp[0] = 0;

for (int i = 1; i <= N; i++) {
dp[i] = Integer.MAX_VALUE;
for (int j = 1; j <= X; j++) {
if (i - j >= 0) {
// Calculate the cost for completing session X days ago.
int cost = dp[i - j] + A[i - 1];
dp[i] = Math.min(dp[i], cost);
}
}
if (i >= X) {
// Add the cost of doing a session Y days ago (if possible).
dp[i] = Math.min(dp[i], dp[i - X] + Y);
}
}

// The minimum cost to complete all sessions is in dp[N].
return dp[N];
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
Rehab soln = new Rehab();
int n,x,y;
n=scan.nextInt();
int[] A = new int[n];
for(int i=0;i<n;i++)
{
A[i]=scan.nextInt();
}
x=scan.nextInt();
y=scan.nextInt();

int result = soln.solution(A, x, y);
System.out.println("Minimum cost of rehabilitation: " + result);
}
}

