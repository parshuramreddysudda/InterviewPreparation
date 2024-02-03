function reverseWords(sentence) {

    // Replace this placeholder return statement with your code
    let left=0,right=0,end=sentence.length;
    let newSentence="";
    // sentence.
    console.log(sentence.split(" ").filter((word)=>word!=="").map((word)=>word.split("").reverse().join(""))
                  .reverse().map((word)=> word.split("").reverse().join("")).join(" "))
    while(left<end){
        while(sentence.charAt(right) !== ' ' && right<end)
            right++;

        newSentence+=sentence.substring(left,right).split("").reverse().join("") + " "
        left = ++right;
        // console.log(newSentence);

    }
    return "";
}

reverseWords("We    Love Javascript      ")


