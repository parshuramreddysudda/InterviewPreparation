function findSumOfThree(nums, target) {
    // Replace this placeholder return statement with your code
    nums.sort();
    let left=0,right=target.length-1,middle=1;
    let leftNum,rightNum,middleNum;
    console.log("Right value is ",right);
    while(left<right){
        console.log("Inside the sums")
        leftNum=nums[left];
        rightNum=nums[right];
        middle=left+1;
        while(middle<right){
            middleNum=nums[middle];
            if(leftNum!==rightNum && leftNum !==middleNum && rightNum !== middleNum){
                console.log("Inside the sums")
                if(leftNum+rightNum+middleNum===target){
                    return true;
                }
            }
            middle++;
        }
        if(leftNum+rightNum+middleNum<target){
            left++
        }else{
            right--;
        }
    }
    return false
}

console.log(findSumOfThree([3, 7, 1, 2, 8, 4, 5] , 21))
