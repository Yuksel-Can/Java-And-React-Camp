/*      //REST
let showProducts = function (id,...products) {
    console.log(id);
    console.log(products);
}

//console.log(typeof showProducts);   //bu bize verilen şeyin türünü verir
//showProducts();
showProducts(10,"Elma", "Armut", "Karpuz");
*/

/*        //SPREAD
console.log(Math.max(3,5,2));
console.log(Math.max([1,2,3]));     //dizi gönderince çalışmaz
                                //ama veriler back den array gelir o yüzden parçalıycaz
let points=[1,2,3,4,6,8,22,9];

console.log(...points);         //işte tüm olay bu.
console.log(Math.max(...points));   //buda kullanımı
*/

 /*       //DESTRUCTURİNG

let populations = [10000, 20000, 30000];
let [small, medium, high] = populations;
console.log(small);
console.log(medium);
console.log(high);  //gelen veriyi değişkenlere atama yöntemidir.

*/
/*
let populations = [10000, 20000, 30000,40000];
let [small, medium,undifiend, high] = populations;
console.log(small);
console.log(medium);
console.log(high); 
*/
/*
let populations = [10000, 20000, 30000,[40000, 50000] ];
let [small, medium, high, [veryHigh, maximum]] = populations;
console.log(small);
console.log(medium);
console.log(high);
console.log(veryHigh); 
console.log(maximum);
*/
/*
let populations = [10000, 20000, 30000,[40000, 50000] ];

function someFunction([small], number){
    console.log(small);
}
someFunction(populations);
*/
/*
let category = {id:1, name:"içecek"}
console.log(category.id);
console.log(category["name"]);  //iki kullanımda uygundur.
*/
/*
let category = {id:1, name:"İçecek"}
let {id, name} = category
console.log(id);
console.log(name);      //buda objelerle kullanım şeklidir
*/