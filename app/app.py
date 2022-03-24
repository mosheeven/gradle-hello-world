
import sys
from traceback import print_tb

def boom7(limit):
    for num in range(limit):
        if num%7 == 0:
            print(str(num) + " 7 Boommm :)")
        else:
            print(num)


if __name__ == '__main__':
    limit = int(sys.argv[1])
    boom7(limit)