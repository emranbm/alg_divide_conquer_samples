#include <iostream>

using namespace std;

int count(int, int = 3);

int main(){
	int money;
	cin >> money;

	cout << count(money);

	getchar();
	getchar();
}
/**
unit parameter is not necessary.
*/
int count(int money, int unit){
	if (money == 0)
		return 1;

	if (money < 0)
		return 0;

	if (unit == 3)
		return count(money - 3, 3) + count(money - 5, 5) + count(money - 7, 7);
	else if (unit == 5)
		return count(money - 5, 5) + count(money - 7, 7);
	else
		return count(money - 7, 7);
}
