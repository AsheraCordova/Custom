//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\CustomPlugin\src\main\java\com\ashera\custom\LowerCaseSuffixFilter.java
//

#include "IOSObjectArray.h"
#include "J2ObjC_source.h"
#include "LowerCaseSuffixFilter.h"


@implementation ASLowerCaseSuffixFilter

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASLowerCaseSuffixFilter_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (jboolean)filterWithNSString:(NSString *)value
                  withNSString:(NSString *)query {
  jboolean matches = false;
  if (query == nil || [query java_length] == 0) {
    return true;
  }
  if (value == nil) {
    return false;
  }
  query = [query lowercaseString];
  if ([((NSString *) nil_chk([value lowercaseString])) java_hasSuffix:query]) {
    matches = true;
  }
  else {
    IOSObjectArray *words = [value java_split:@" "];
    {
      IOSObjectArray *a__ = words;
      NSString * const *b__ = ((IOSObjectArray *) nil_chk(a__))->buffer_;
      NSString * const *e__ = b__ + a__->size_;
      while (b__ < e__) {
        NSString *word = *b__++;
        if ([((NSString *) nil_chk([((NSString *) nil_chk(word)) lowercaseString])) java_hasSuffix:query]) {
          matches = true;
          break;
        }
      }
    }
  }
  return matches;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(filterWithNSString:withNSString:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "filter", "LNSString;LNSString;" };
  static const J2ObjcClassInfo _ASLowerCaseSuffixFilter = { "LowerCaseSuffixFilter", "com.ashera.custom", ptrTable, methods, NULL, 7, 0x1, 2, 0, -1, -1, -1, -1, -1 };
  return &_ASLowerCaseSuffixFilter;
}

@end

void ASLowerCaseSuffixFilter_init(ASLowerCaseSuffixFilter *self) {
  NSObject_init(self);
}

ASLowerCaseSuffixFilter *new_ASLowerCaseSuffixFilter_init() {
  J2OBJC_NEW_IMPL(ASLowerCaseSuffixFilter, init)
}

ASLowerCaseSuffixFilter *create_ASLowerCaseSuffixFilter_init() {
  J2OBJC_CREATE_IMPL(ASLowerCaseSuffixFilter, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASLowerCaseSuffixFilter)
