//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\CustomPlugin\src\main\java\com\ashera\custom\CustomMethodHandler.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_CustomMethodHandler")
#ifdef RESTRICT_CustomMethodHandler
#define INCLUDE_ALL_CustomMethodHandler 0
#else
#define INCLUDE_ALL_CustomMethodHandler 1
#endif
#undef RESTRICT_CustomMethodHandler

#if !defined (ASCustomMethodHandler_) && (INCLUDE_ALL_CustomMethodHandler || defined(INCLUDE_ASCustomMethodHandler))
#define ASCustomMethodHandler_

#define RESTRICT_MethodHandler 1
#define INCLUDE_ASMethodHandler 1
#include "MethodHandler.h"

@protocol ASIWidget;

@interface ASCustomMethodHandler : NSObject < ASMethodHandler >

#pragma mark Public

- (instancetype)init;

- (NSString *)handleWithNSString:(NSString *)methodName
                          withId:(id)obj
                   withASIWidget:(id<ASIWidget>)widget;

@end

J2OBJC_EMPTY_STATIC_INIT(ASCustomMethodHandler)

FOUNDATION_EXPORT void ASCustomMethodHandler_init(ASCustomMethodHandler *self);

FOUNDATION_EXPORT ASCustomMethodHandler *new_ASCustomMethodHandler_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASCustomMethodHandler *create_ASCustomMethodHandler_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASCustomMethodHandler)

@compatibility_alias ComAsheraCustomCustomMethodHandler ASCustomMethodHandler;

#endif

#pragma pop_macro("INCLUDE_ALL_CustomMethodHandler")
