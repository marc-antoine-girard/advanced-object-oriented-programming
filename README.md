
# Advanced object-oriented programming

## Cloning the repository

 Using git:

```curl
git clone https://github.com/marc-antoine-girard/advanced-object-oriented-programming.git
```

## Pull new versions
```curl
git pull
```
If it aborts / doesn't work, you might have modified some files and its expecting you to commit them first. Since you can't push on this project, your options are:
1. Discard your changes and pull. The reset command will reset your head to the last commit from the remote branch (origin = remote)
```curl
git add .
git reset --hard origin/main
```

2. Stash your changes during the pull

```curl
git add .
git stash
git pull
```

## Course 01

Introduction to `Scanner class`

## Course 02

Demo with the `Banana Class`. Method override and overload, Operator precedence.

***Bonus**: `Color enum`, `Apple Class`*

## Course 03

Demo with the abstract class `Fruit`.

Exercises 1 - 12.

***Exercise with additional functionalities**: Q3, Q9*

## Course 04

Exercises about Cat, Dog, Mouse, overriding and overloading methods.



### Resources

- <https://www.sololearn.com/>
- 
- Clean Code, _by **Robert Martin**_
- Clean Coder  _by **Robert Martin**_

-----

*Gitignore generated using [gitignore.io](https://www.toptal.com/developers/gitignore/)*
