#include <iostream>
#include <windows.h>

using namespace std;
/* Завдання Варіанта 10 */
struct LinearEquation {
    double first;
    double second;

    bool Init(double a, double b) {
        if (a == 0.0) {
            cout << "Помилка: коефіцієнт A не може дорівнювати 0!" << endl;
            return false;
        }
        first = a;
        second = b;
        return true;
    }

    void Read() {
        double a, b;
        do {
            cout << "Введіть коефіцієнт A (A != 0): ";
            cin >> a;
            cout << "Введіть коефіцієнт B: ";
            cin >> b;
        } while (!Init(a, b));
    }

    void Display() {
        cout << "Рівняння: y = " << first << " * x ";
        if (second >= 0) {
            cout << "+ " << second << endl;
        }
        else {
            cout << "- " << -second << endl;
        }
    }

    double function(double x) {
        return first * x + second;
    }
};

int main() {
    SetConsoleCP(65001);
    SetConsoleOutputCP(65001);

    LinearEquation eq;
    eq.Read();
    eq.Display();

    double x;
    cout << "Введіть x: ";
    cin >> x;

    cout << "y = " << eq.function(x) << endl;

    return 0;
}