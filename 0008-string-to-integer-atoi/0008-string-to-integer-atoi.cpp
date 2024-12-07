class Solution {
public:
    int myAtoi(string s) {
         int sign = 1, base = 0, i = 0;

    // Skipping whitespace characters
    while (s[i] == ' ')
        i++;

    // Handling signs
    if (s[i] == '-' || s[i] == '+') {
        sign = (s[i++] == '-') ? -1 : 1;
    }

    // Converting characters to integer until invalid characters are encountered
    while (s[i] >= '0' && s[i] <= '9') {
        int digit = s[i] - '0';

        // Handling overflow
        if (base > INT_MAX / 10 || (base == INT_MAX / 10 && digit > 7)) {
            return (sign == 1) ? INT_MAX : INT_MIN;
        }
        base = 10 * base + digit;
        i++;
    }

    // Applying sign
    return base * sign;

}
};