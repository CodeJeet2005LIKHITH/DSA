number = 7
def GeekoNaci(number):
    if number == 1:
        return 1
    if number == 2:
        return 3
    if number == 3:
        return 2
    return GeekoNaci(number - 1) + GeekoNaci(number - 2) + GeekoNaci(number - 3)

