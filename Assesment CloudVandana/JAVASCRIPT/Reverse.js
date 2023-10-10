<!DOCTYPE html>
<html>
<body>

<h2>Reverse Sentense </h2>

<script>
const str = 'This is a Sunny Day';
const reverseSentence = str => 
{
   const arr = str.split(" ");
   const reversed = arr.map(el => 
   {
      return el.split('').reverse().join("");
   });
   return reversed.join(" ");
};
console.log(reverseSentence(str));
</script>
</body>
</html>