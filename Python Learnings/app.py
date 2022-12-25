def fizzbuzz(number):

    result = ""
    if (number % 3 == 0):
        result = "Fizz"

    if (number % 5 == 0):
        result += ("Buzz")

    if (len(result) == 0):
        return number
    else:
        return result
    # return (len(result) == 0) if number else result


print("Result is", fizzbuzz(7))
