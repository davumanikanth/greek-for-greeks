<h2><a href="https://www.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1?page=7&category=Strings&difficulty=Easy&status=unsolved&sortBy=latest">String Rotated by 2 Places</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given two strings <strong>s1 </strong>and <strong>s2</strong>. Return true if the string <strong>s2</strong> can be obtained by rotating&nbsp;(<strong>in any direction</strong>) string <strong>s1</strong> by <strong>exactly 2</strong> places, otherwise, false.</span></p>
<p><span style="font-size: 14pt;"><strong>Note:</strong> Both rotations should be performed in same direction chosen initially.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "amazon", s2 = "azonam"
<strong>Output: </strong>true<strong>
Explanation: "</strong>amazon" can be rotated anti-clockwise by two places, which will make it as "azonam".
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "geeksforgeeks", s2 = "geeksgeeksfor"
<strong>Output: </strong>false<strong>
Explanation: </strong>If we rotate "geeksforgeeks" by two place in any direction, we won't get "geeksgeeksfor".<br></span></pre>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input: </strong><span style="font-size: 14pt;">s1 = "ab", s2 = "ab"
</span><strong style="font-size: 14pt;">Output: </strong><span style="font-size: 14pt;">true<br></span><span style="font-size: 18.6667px;"><strong>Explanation:</strong> If we rotate "ab" by two place in any direction, we always get "ab".</span></span></pre>
<p><span style="font-size: 14pt;"><strong>Challenge: </strong>Try doing it in O(1) space complexity</span></p>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ s1.length, s2.length ≤ 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Accolite</code>&nbsp;<code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Data Structures</code>&nbsp;