#include <stdio.h>
#include <string.h>
#include <stdlib.h>
char* longestPalindrome(char* s)
{
	int len = strlen(s);//子串长度
	if (len <= 1)
	{
		return s;
	}
	int start = 0;
	int maxlen = 0;
	//i表示第二个元素下标
	for (int i = 1; i < len; i++)
	{
		//偶数长度
		int low = i - 1, high = i;//高低位赋值
		//以i-0.5为中心向两边扩散
		while (low >= 0 && high < len && s[low] == s[high])
		{
			low--;
			high++;//以
		}
		if (high - low - 1 > maxlen)
		{
			maxlen = (high - low) - 1;
			start = low + 1;
		}
		//奇数长度
		low = i - 1; high = i + 1;//以i为中心向两边扩散
		while (low >= 0 && high < len && s[low] == s[high])
		{
			low--;
			high++;
		}
		if (high - low - 1 > maxlen)
		{
			maxlen = (high - low) - 1;
			start = low + 1;
		}
	}
	char* arr = (char*)malloc(sizeof(int) * (maxlen * 2));
	//回文乘2
	int i = 0;
	for ( ; i < maxlen; i++)
	{
		arr[i] = s[start++];
	}
	arr[i] = '\0';
	return arr;
}
char main()
{
	char* a = (char*)malloc(sizeof(char));
	char* pchar = NULL;
	printf("任意输入一串不含空格的字符串:");
	scanf_s("%s", a);
	pchar = longestPalindrome(a);
	printf("最长回文子串为:%s", pchar);
	free(a);
	getchar();
	getchar();
	return 0 ;
}
