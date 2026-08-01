<h2><a href="https://www.geeksforgeeks.org/problems/paths-to-reach-origin3850/1">Paths to reach origin</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Geek is standing at a point <strong>(x, y)</strong> on a <strong>2D</strong> grid and wants to reach the origin <strong>(0, 0)</strong>. From any point, Geek can move in only two directions: <strong>left,</strong> from <strong>(x, y)</strong> to <strong>(x - 1, y)</strong>, or down, from <strong>(x, y)</strong> to <strong>(x, y - 1)</strong>.</span></p>
<p><span style="font-size: 14pt;">Find the total number of distinct paths for Geek to reach <strong>(0, 0)</strong> from <strong>(x, y)</strong>. Since the answer can be very large, return it modulo <strong>1000000007.</strong></span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>x = 3, y = 0<strong>
Output: </strong>1<strong>
Explanation: </strong>The only possible path is (3,0) → (2,0) → (1,0) → (0,0), since y = 0, there is no option to move down at any step.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>x = 3, y = 6<strong>
Output: </strong>84<strong>
Explanation: </strong>There are a total of 84 distinct paths from (3,6) to (0,0) using only left and down moves.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>0 ≤ x, y ≤ 500</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Dynamic Programming</code>&nbsp;<code>Matrix</code>&nbsp;