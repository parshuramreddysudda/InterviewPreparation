import re


def reverse_words(sentence):
    # Replace this placeholder return statement with your code
    sentence = re.sub(" +", " ", sentence.strip())

    newList = sentence.split()
    newList.reverse()
    newString = " ".join(newList)

    return newString


print(reverse_words("We love Python"))
