#include "store.h"
#include "product.h"

#include <cctype>
#include <iostream>

class DistributionSystem {
	vector<Store*> _allStores;
	vector<Product*> _allProducts;
	long _maxStores;
	void removeStore(Store store) { // dummy store
		/* TODO */
	}
	void removeProduct(Product prod) { // dummy prod
		/* TODO */
	}
  public:
	DistributionSystem(long maxStores)
		: _allStores(), _allProducts(), _maxStores(maxStores) {}
	~DistributionSystem() { /* TODO */ }
	void addStore(long id, string outlet, string storeName) { /* TODO */ }
	void addProduct(long id, string brand, string prodName) { /* TODO */ }
	void removeStore(long id) { /* TODO */ }
	void removeStore(string outlet, string storeName) { /* TODO */ }
	void removeProduct(long id) { /* TODO */ }
	void removeProduct(string brand, string prodName) { /* TODO */ }
	void map(string brand, string prodName, string outlet, string storeName) { /* TODO */ }
	void unmap(string brand, string prodName, string outlet, string storeName) { /* TODO */ }
	void printAll() { /* TODO */ }
};

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	long maxStores;
	cin >> maxStores;
	DistributionSystem sys(maxStores);
	// handle operations
	/* TODO */
	sys.printAll();
	return 0;
}
