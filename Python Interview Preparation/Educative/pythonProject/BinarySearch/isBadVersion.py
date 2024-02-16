# -- DO NOT CHANGE THIS SECTION -----------------

# import main as api_call


def is_bad_version(
        v):  # is_bad_version() is the API function that returns true or false depending upon whether the provided version ID is bad or not
    return True
    # return api_call.is_bad(v)


# -----------------------------------------------

def first_bad_version(n):
    # Replace this placeholder return statement with your code

    low = 0
    high = n

    while low < high:
        mid = low + (high - low) // 2
        if is_bad_version(mid):
            high = mid
        else:
            low = mid

    return 0, 0



