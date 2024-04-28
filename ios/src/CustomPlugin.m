//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\CustomPlugin\src\main\java\com\ashera\custom\CustomPlugin.java
//

#include "CustomEventCommand.h"
#include "CustomMethodHandler.h"
#include "CustomPlugin.h"
#include "CustomValidator.h"
#include "EventCommandFactory.h"
#include "FilterFactory.h"
#include "IOSClass.h"
#include "J2ObjC_source.h"
#include "LowerCaseSuffixFilter.h"
#include "MethodHandlerFactory.h"
#include "ValidatorFactory.h"


@implementation ASCustomPlugin

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASCustomPlugin_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (void)init__ {
  ASCustomPlugin_init__();
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 0, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(init__);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "init" };
  static const J2ObjcClassInfo _ASCustomPlugin = { "CustomPlugin", "com.ashera.custom", ptrTable, methods, NULL, 7, 0x1, 2, 0, -1, -1, -1, -1, -1 };
  return &_ASCustomPlugin;
}

@end

void ASCustomPlugin_init(ASCustomPlugin *self) {
  NSObject_init(self);
}

ASCustomPlugin *new_ASCustomPlugin_init() {
  J2OBJC_NEW_IMPL(ASCustomPlugin, init)
}

ASCustomPlugin *create_ASCustomPlugin_init() {
  J2OBJC_CREATE_IMPL(ASCustomPlugin, init)
}

void ASCustomPlugin_init__() {
  ASCustomPlugin_initialize();
  ASValidatorFactory_register__WithNSString_withASValidation_(@"lowercaseonly", new_ASCustomValidator_init());
  ASMethodHandlerFactory_register__WithASMethodHandler_(new_ASCustomMethodHandler_init());
  ASEventCommandFactory_registerCommandWithNSString_withASEventCommand_(@"custom", new_ASCustomEventCommand_init());
  ASFilterFactory_register__WithNSString_withASIFilter_([ASLowerCaseSuffixFilter_class_() getName], new_ASLowerCaseSuffixFilter_init());
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASCustomPlugin)
