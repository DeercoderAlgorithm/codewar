#!/usr/bin/env python
def sum_of_n(n):
  i = 0
  result = []
  count =  abs(n) #-n if n < 0 else n
  while i <= count:
      sum = 0
      for j in range(0, i+1):
          sum += j
      if n < 0:
          result.append(-sum)
      else:
          result.append(sum)
      i += 1
  return result
  
  
if __name__ == "__main__":
    print sum_of_n(0)  