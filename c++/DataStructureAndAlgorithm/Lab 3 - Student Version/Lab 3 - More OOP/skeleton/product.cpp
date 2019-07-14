#include "product.h"
	// know how Product class is defined
#include <sstream>

Product::Product(long id, string brand, string name, long maxStores) { /* TODO */ }
Product::~Product() { /* TODO */ }

bool Product::operator==(const Product& other) { return false; /* TODO */ }
long Product::getStoreCount() { return -1; /* TODO */ }

void Product::addStore(Store* store) { /* TODO */ }
bool Product::hasStore(Store* store) { return false; /* TODO */ }
void Product::eraseStore(Store* store) { /* TODO */ }
string Product::toShortString() { return "skeleton"; /* TODO */ }
string Product::toLongString() { return "skeleton"; /* TODO */ }
