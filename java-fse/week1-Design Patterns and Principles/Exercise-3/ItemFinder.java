public class ItemFinder {
public static ShopData linearSearch(ShopData[] items, String keyword) {
for (int i = 0; i < items.length; i++) {
if (items[i].productName.equalsIgnoreCase(keyword)) {
return items[i];
            }
        }
return null;
    }
public static ShopData binarySearch(ShopData[] items, String keyword) {
int low = 0, high = items.length - 1;
while (low <= high) {
int mid = (low + high) / 2;
int result = items[mid].productName.compareToIgnoreCase(keyword);
if (result == 0) return items[mid];
else if (result < 0) low = mid + 1;
else high = mid - 1;
        }
return null;
    }
}
