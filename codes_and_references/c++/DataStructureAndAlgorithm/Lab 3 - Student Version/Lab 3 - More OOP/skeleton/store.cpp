#include "store.h"
	// know how Store class is defined
#include <sstream>

Store::Store(long id, string outlet, string name) { /* TODO */ }
Store::~Store() { /* TODO */ }

bool Store::operator==(const Store& other) { return false; /* TODO */ }
long Store::getProductCount() { return -1; /* TODO */ }

void Store::addProduct(Product* prod) { /* TODO */ }
bool Store::hasProduct(Product* prod) { return false; /* TODO */ }
void Store::eraseProduct(Product* prod) { /* TODO */ }
string Store::toShortString() { return "skeleton"; /* TODO */ }
string Store::toLongString() { return "skeleton"; /* TODO */ }
