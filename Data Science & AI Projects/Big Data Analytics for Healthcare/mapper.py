#!/usr/bin/env python3
import sys

for line in sys.stdin:
    line = line.strip()
    parts = line.split(",")
    if len(parts) > 3:  # assuming: Visit Number, Date, Test Name, Result
        result = parts[3].strip().lower()
        if "positive" in result:
            print("Positive\t1")
        elif "negative" in result:
            print("Negative\t1")
