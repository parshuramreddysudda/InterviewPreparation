console.log(isHappyNumber(19))
console.log(isHappyNumber(10))
console.log(isHappyNumber(13))
console.log(isHappyNumber(23456789876))
console.log(isHappyNumber(1235245))

function isHappyNumber(n){

    if(n===1)
        return true
    // Replace this placeholder return statement with your code
    // console.log(getNumber(n))
    let fast=n,slow=n;

    while(fast !==1){
        fast=getNumber(getNumber(fast));
        slow=getNumber(slow);

        if(fast!==1 && fast===slow)
            return false
    }
    return true;
}

function getNumber(n){

    let num=0;
    while(n>0){
        let temp=n%10
        n=Math.floor(n/10)
        num+=temp*temp;
    }
    return num;
}