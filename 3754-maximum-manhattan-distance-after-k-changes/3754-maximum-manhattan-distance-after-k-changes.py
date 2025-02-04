class Solution:
    def maxDistance(self, s: str, k: int) -> int:
        # find max when going only in (NE, NW, SE, SW)
        opp_dir = {'N': (0,-1), 'S': (0,1), 'E': (-1,0),'W': (1,0)}
        max_dist = 0
        for dirs in 'NE','NW','SE','SW':
            x = y = 0
            kk = k
            for d in s:
                if d in dirs and kk:
                    kk -= 1
                    x += opp_dir[d][0]
                    y += opp_dir[d][1]
                else:
                    x -= opp_dir[d][0]
                    y -= opp_dir[d][1]
                max_dist = max(max_dist, abs(x) + abs(y))
        return max_dist