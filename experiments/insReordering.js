var y = 20;
var x = 10;
var z = x + y;
function sum() {
    var y = 30;
    var x = 40;
    z = x + y;
    var temp = z + x;
    function inner() {
        var x;
    }
}
z = 30;