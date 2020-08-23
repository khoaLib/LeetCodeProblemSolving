## Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.Essentially, rearrange the digits to create the highest possible number.

### Examples:
    Input: 42145 Output: 54421

    Input: 145263 Output: 654321

    Input: 123456789 Output: 987654321

### Sample Tests:
    Test.assertEquals(descendingOrder(0), 0)
    Test.assertEquals(descendingOrder(1), 1)
    Test.assertEquals(descendingOrder(123456789), 987654321)

### Solution: 
```C
    function descendingOrder(n){
  //...
  var num = n;
  var arr = [];
  var stringNum= num.toString();
  
  for (var i=0;i<stringNum.length; i++){
    arr.push(parseInt(stringNum.charAt(i)));
  }
  arr.sort(function(a,b){return a - b});
  console.log(arr);
  num=0;
  for(var i=0;i<stringNum.length; i++){
    num =(num*10) + arr.pop();
  }
  return num;
  }
```
