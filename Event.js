console.log("A");

setTimeout(()=>{
    console.log("B");
},60000)
console.log("C")

const example1 = ()=>{
    console.log("Hellow")
}

function example1(){
    console.log("Hi")
}

const promise = new promise((resolve,reject)=>{
    setTimeout(example1,4500)
    setTimeout(example1,0)
})