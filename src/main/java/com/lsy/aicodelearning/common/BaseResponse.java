package com.lsy.aicodelearning.common;

import com.lsy.aicodelearning.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/*@Data 等价于同时使用了以下注解：
@Getter: 为所有非静态字段生成 public 的 getter 方法。
@Setter: 为所有非 final 且非静态的字段生成 public 的 setter 方法。
@ToString: 生成 toString() 方法，默认包含所有非静态字段。
@EqualsAndHashCode: 生成 equals(Object other) 和 hashCode() 方法，默认使用所有非静态、非瞬态字段（除非用 @EqualsAndHashCode.Exclude 排除）。
@RequiredArgsConstructor: 生成一个包含所有 final 字段以及标记为 @NonNull 且未在声明时初始化的字段的构造函数。
*/
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}

