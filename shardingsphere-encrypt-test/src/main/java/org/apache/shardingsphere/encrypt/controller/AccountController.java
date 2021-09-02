package org.apache.shardingsphere.encrypt.controller;

import org.apache.shardingsphere.encrypt.controller.message.request.SaveAccountRequest;
import org.apache.shardingsphere.encrypt.domain.AccountInfo;
import org.apache.shardingsphere.encrypt.mapper.AccountInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountInfoMapper accountInfoMapper;

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody SaveAccountRequest request) {
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setAccountName(request.getAccountName());
        accountInfo.setAccountIdCard(request.getAccountIdCard());
        accountInfo.setAccountMobile(request.getAccountMobile());
        accountInfoMapper.insertSelective(accountInfo);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello");
    }
}
