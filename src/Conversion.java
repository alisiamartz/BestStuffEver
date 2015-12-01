public class Conversion
{
  int[] stringToBitseq (String s) {
    
  }
  
  int [] BitseqToDigitseq () {
    
  }
  
  int BitseqToBigNum () {
    
  }
  
  int NumToBitseq (int n) {
    
  }
}


-----------------------------------------------------------

/*
𝑠𝑡𝑟𝑖𝑛𝑔𝑇𝑜𝐵𝑖𝑡𝑠𝑒𝑞(𝑠: 𝑠𝑡𝑟𝑖𝑛𝑔): 𝑎𝑟𝑟𝑎𝑦 𝑜𝑓 {0.1}
returns an array of 0s and 1s constructed by representing each character in s by its
assigned bit pattern (position in the list below represented as a numeral to base 2)Use the following ordering of digits and letters:
00000000001111111111222222222233333333334444444444555555555566
01234567890123456789012345678901234567890123456789012345678901
0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ
Sample translations:
0 ⟼ 000000 (position 00)
1 ⟼ 000001 (position 01)
9 ⟼ 001001 (position 09)
𝑎 ⟼ 001010 (position 10)
𝑘 ⟼ 010100 (position 20)
𝑢 ⟼ 011110 (position 30)
𝐸 ⟼ 101000 (position 40)
𝑂 ⟼ 011110 (position 50)
𝑌 ⟼ 111100 (position 60)
The string 𝑚𝑜𝑙𝑙𝑦1 translates to the bit sequence
22 24 47 47 60 01 // position as base 10 numeral
010110 011000 101111 101111 111100 000001 <- least significant digit on right

𝐵𝑖𝑡𝑠𝑒𝑞𝑇𝑜𝐷𝑖𝑔𝑖𝑡𝑠𝑒𝑞(𝑏𝑠: 𝑎𝑟𝑟𝑎𝑦 𝑜𝑓 {0,1}, 𝑘: 𝑛𝑢𝑚𝑏𝑒𝑟): 𝑎𝑟𝑟𝑎𝑦 𝑜𝑓 𝑑𝑖𝑔𝑖𝑡𝑠 𝑡𝑜 𝑏𝑎𝑠𝑒 2
𝑘
Returns an array of numbers in the range [0. . 2
𝑘 − 1]
Example: let k=4. Divide the bit sequence for 𝑚𝑜𝑙𝑙𝑦1 into groups of 4 bits (starting from
right; the last group on the left may not always be full: complete with 0s):
010110 011000 101111 101111 111100 000001
 5 9 8 11 14 15 15 0 1

𝐵𝑖𝑡𝑠𝑒𝑞𝑇𝑜𝐵𝑖𝑔𝑁𝑢𝑚(𝑏𝑠: 𝑎𝑟𝑟𝑎𝑦 𝑜𝑓 {0,1}, 𝑘: 𝑛𝑢𝑚𝑏𝑒𝑟): 𝐵𝑖𝑔𝑁𝑢𝑚
Returns a BigNum 𝑏𝑛 whose representation to the base 2 is bs
For the bitseq for 𝑚𝑜𝑙𝑙𝑦1 we get: 𝑏𝑛 = ∑ 𝑏𝑠[𝑖] ⋅
35
𝑖=0 2
𝑖
 (least significant bit (0) on right)

𝑁𝑢𝑚𝑇𝑜𝐵𝑖𝑡𝑠𝑒𝑞(𝑛: 𝑖𝑛𝑡𝑒𝑔𝑒𝑟): 𝑎𝑟𝑟𝑎𝑦 𝑜𝑓 {0,1}
Turns the integer 𝑛 into a sequence of bits
𝐵𝑠: 𝑎𝑟𝑟𝑎𝑦 𝑜𝑓 {0, 1}
𝑖: = 0
𝑤ℎ𝑖𝑙𝑒 𝑛 > 1 𝑑𝑜
𝑛2 ∶= 𝑛/2 // 𝑖𝑛𝑡𝑒𝑔𝑒𝑟 𝑑𝑖𝑣𝑖𝑠𝑖𝑜𝑛: 𝑒. 𝑔. 5/2 = 2
𝑏𝑠[𝑖] ≔ 𝑛 − 2 ∗ 𝑛2
n:= n2

*/ 
