let x = "hello"
x[0] = 'z'
//you would expect the result  to be {x = zello}, but instead it is still {x = hello} because Js does not allow re-assignment of characters in a string

//Most languages have a .split function which splits the characters (use a delimiter), so using an array instead would work
let y = x.split(' ')
//result would be {y = ['h', 'e', 'l', 'l', 'o']}
y[0] = 'z'
//result would be {y = ['z', 'e', 'l', 'l', 'o']}
y.join(' ')
//result would be {y = zello}, a string again



