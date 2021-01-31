package com.String;

public class Replace {
	
	public void count(String s) {
		int count = 0;
		char[] string = s.toCharArray();
		for(int l = 0;l<string.length;l++) {
			if(l+1 == string.length) {
				System.out.println(count);
				System.out.println(string);
			return;
			}
			if(string[l]== string[l+1]) {
				count++;
				if(string[l+1] == 'x') {
					string[l+1] = 'y';
				}else {
					string[l+1] = 'x';
				}
			}
		}
	}

	public static void main(String[] args) {
		Replace replace = new Replace();
		replace.count("xxxyxyxyyy");

	}

}
