from collections import defaultdict

def swaps(t):
  return { t, t[1]+t[0]+t[2], t[0]+t[2]+t[1] }

def solution(T):
  ans = 0
  occ = defaultdict(int)
  for t in T:
    occ[t] += 1

  for t in T:
    for cand in swaps(t):
      cnt = sum(occ[s] for s in swaps(cand))
      ans = max(ans, cnt)

  return ans

assert (3==solution([ "aab", "cab", "baa", "baa" ]))
assert (2==solution([ "zzz", "zbz", "zbz", "dgf" ]))
assert (3==solution([ "abc", "cba", "cab", "bac", "bca" ]))
assert (5==solution([ "eee", "eee", "eee", "eee", "eee" ]))
