| Pattern          | Logic                  |
| ---------------- | ---------------------- |
| Half diamond     | `stars = i`            |
| Full diamond     | `stars = 2i − 1`       |
| Inverted pyramid | `stars = 2(n − i) + 1` |
 

 ## use full when want know pyramids.

🔺 PYRAMID FORMULAS (ONE TABLE)

Let

n = height

i = row number (1 → n)



| **Pattern**                       | **Spaces Formula** | **Stars Formula** | **Notes**       |
| --------------------------------- | ------------------ | ----------------- | --------------- |
| **Half pyramid (left)**           | `0`                | `i`               | Simple growth   |
| **Inverted half pyramid**         | `0`                | `n − i + 1`       | Simple shrink   |
| **Half pyramid (right)**          | `n − i`            | `i`               | Right-aligned   |
| **Inverted half pyramid (right)** | `i − 1`            | `n − i + 1`       | Mirror of above |
| **Full pyramid (centered)**       | `n − i`            | `2i − 1`          | Base formula    |
| **Inverted pyramid**              | `i − 1`            | `2(n − i) + 1`    | Reverse of full |
| **Hollow full pyramid**           | `n − i`            | `2i − 1`          | Border logic    |
| **Hollow inverted pyramid**       | `i − 1`            | `2(n − i) + 1`    | Border logic    |
