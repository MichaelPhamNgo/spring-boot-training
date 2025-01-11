var num = 10;

var obj =  {
   
        num : 8,
        inner : {
            num: 6,
            print1: function() {
                console.log('print1: ' + this.num);
            },
            print2: () => {
                console.log('print2: ' + this.num);
            }
        },
     
}




num = 999;
console.log(obj.inner);
obj.inner.print1();
var fn = obj.inner.print1;
fn();
(obj.inner.print1)(); 
(obj.inner.print2)();