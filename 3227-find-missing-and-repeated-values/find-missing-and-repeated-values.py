class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        n = len(grid)
        n_squ = n * n

        exp_sum = n_squ * (n_squ + 1) // 2
        exp_squ_sum = n_squ * (n_squ + 1) * (2 * n_squ + 1) // 6

        act_sum = 0
        act_squ_sum = 0

        for i in range(n):
            for j in range(n):
                act_sum += grid[i][j]
                act_squ_sum += grid[i][j] * grid[i][j]
        
        diff_sum = exp_sum - act_sum
        diff_squ_sum = exp_squ_sum - act_squ_sum

        sum_a_b = diff_squ_sum // diff_sum

        a = (sum_a_b - diff_sum) // 2
        b = (sum_a_b + diff_sum) // 2

        return [a,b]
