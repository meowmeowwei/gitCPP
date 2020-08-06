---
description: 'https://www.udemy.com/linux-system-programming/'
---

# Linux System Programming

**environment list** 

-&gt; every program is passed with an environment list. 

![](../../.gitbook/assets/image%20%28188%29.png)

```cpp

extern char **environ;
  
// driver program 
int main(void)
{
/* create a pointer to point to the current entry in the environment list */
char *current_environ_ptr;
/* now copy this pointer to point to the first entry in the list */
current_environ_ptr=*environ;
/* now we loop through all of the environment table entries until we
get to the last entry signified by a NULL */
do
{
	/* we now print out the environment string */
	printf("%s\n",current_environ_ptr);
	/* now point current_environment_ptr to the next entry in the list */
	current_environ_ptr=*environ++;
	/* and check to see if it is the last */
}while(current_environ_ptr != NULL);
	return 0;
}
```



