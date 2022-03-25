
import sys
from traceback import print_tb
import os

def boom7(limit):
    for num in range(limit):
        if num%7 == 0:
            print(str(num) + " 7 Boommm :)")
        else:
            print(num)


if __name__ == '__main__':
    print(type(os.getenv("MAX_NUM")))
    limit = int(os.getenv("MAX_NUM"))
    boom7(limit)