#!/usr/bin/env python

def longest(s1, s2):
    connect = s1 + s2
    result = ""
    for s in connect:
        if s not in result:
            result += s
    return ''.join(sorted(result))

if __name__ == "__main__":
    print longest("aretheyhere", "yestheyarehere")
    print longest("loopingisfunbutdangerous", "lessdangerousthancoding")
    print longest("inmanylanguages", "theresapairoffunctions")
    
"""
Questions to be reviewed?
What is the usage of  join?
why here return sorted(result) is a list, instead of a string?
why using the blank string with join function could work?
"""