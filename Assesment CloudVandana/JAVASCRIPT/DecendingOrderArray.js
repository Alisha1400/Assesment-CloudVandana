<!DOCTYPE html>
<html>
<body>

<h2>Javascript Array </h2>

<p>Decending order of the elements of an array.</p>

<p id="demo"></p>

<script>
const points = [30, 100, 1, 5, 23, 10];
points.sort(function(a, b){return b-a});
document.getElementById("demo").innerHTML = points;
</script>

</body>
</html>